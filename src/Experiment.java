public class Experiment {
    private Sorter sorter;
    private Searcher searcher;

    public Experiment(){
        sorter = new Sorter();
        searcher = new Searcher();
    }

    public long measureSortTime(int[] arr, String type){
        int[] copy = sorter.copyArray(arr);
        long startTime = System.nanoTime();
        if(type.equals("basic")){
            sorter.basicSort(copy);
        }
        else if(type.equals("advanced")){
            sorter.advancedSort(copy);
        }
        long endTime = System.nanoTime();

        return endTime - startTime;
    }

    public long measureSearchTime(int[] arr, int target){
        long startTime = System.nanoTime();

        int result = searcher.search(arr, target);

        long endTime = System.nanoTime();

        if(result != -1){
            System.out.println("Element" + target + "found on index" + result);
        }
        else{
            System.out.println("Element" + target + "not found");
        }
        return endTime - startTime;
    }

    public void runAllExperiments(){
        System.out.println("EXPERIMENTS WITH SORTING ALGORITHMS");

        int[] sizes = {10, 100, 1000};
        String[] sizeNames = {"Little(10)", "Middle(100)", "Large(1000)"};

        for(int s = 0; s < sizes.length; s++){
            int size = sizes[s];
            System.out.println("Array's size: " + sizeNames[s]);

            System.out.println("Random Array");

            int[] randomArr = sorter.generateRandomArray(size);

            if(size <= 10){
                System.out.print("Source Array");
                sorter.printArray(randomArr);
            }

            long timeSelectionRandom = measureSortTime(randomArr, "basic");
            System.out.println("Selection Sort: " + timeSelectionRandom + "ns");

            long timeQuickRandom = measureSortTime(randomArr, "advanced");
            System.out.println("Quick Sort: " + timeQuickRandom + "ns");

            int[] sortedForSearch = sorter.copyArray(randomArr);
            sorter.advancedSort(sortedForSearch);

            int target = sortedForSearch[size / 2];
            System.out.println("Binary Search (looking" + target + "):");
            long timeSearchRandom = measureSearchTime(sortedForSearch, target);
            System.out.println("Binary Search: " + timeSearchRandom + "ns");

            System.out.println("Sorted Array");

            int[] sortedArr = sorter.copyArray(sortedForSearch);

            if(size <= 10){
                System.out.println("Sorted: ");
                sorter.printArray(sortedArr);
            }

            long timeSelectionSorted = measureSortTime(sortedArr, "basic");
            System.out.println("Selection Sort: " + timeSelectionSorted + "ns");

            long timeQuickSorted = measureSortTime(sortedArr, "advanced");
            System.out.println("Quick Sort: " + timeQuickSorted + "ns");

            System.out.println("Binary Search(looking: " + target + "):");
            long timeSearchSorted = measureSearchTime(sortedArr, target);
            System.out.println("Binary Search: " + timeSearchSorted + "ns");

            System.out.println("Comparison");
            System.out.printf("  %-20s %-20s %-20s%n", "Algorithm", "Random", "Sorted");
            System.out.printf("  %-20s %-20d %-20d%n", "Selection Sort", timeSelectionRandom, timeSelectionSorted);
            System.out.printf("  %-20s %-20d %-20d%n", "Quick Sort",     timeQuickRandom,     timeQuickSorted);
            System.out.printf("  %-20s %-20d %-20d%n", "Binary Search",  timeSearchRandom,    timeSearchSorted);
        }
    }
}
