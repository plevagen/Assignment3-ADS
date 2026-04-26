public class Main {
    public static void main(String[] args){
        Sorter sorter = new Sorter();
        Searcher searcher = new Searcher();
        Experiment experiment = new Experiment();

        System.out.println("Demonstration of algorithms on little example");

        int[] demo = sorter.generateRandomArray(10);

        System.out.print("Default array: ");
        sorter.printArray(demo);

        int[] demoForSelection = sorter.copyArray(demo);
        sorter.basicSort(demoForSelection);
        System.out.print("After Selection Sort: ");
        sorter.printArray(demoForSelection);

        int[] demoForQuick = sorter.copyArray(demo);
        sorter.advancedSort(demoForQuick);
        System.out.print("After Quick Sort: ");
        sorter.printArray(demoForQuick);

        int target = demoForQuick[5];
        int foundIndex = searcher.search(demoForQuick, target);
        System.out.println("Binary search: looking" + target + "-> index" + foundIndex);

        int notFound = searcher.search(demoForQuick, -999);
        System.out.println("Binary search: index " + notFound + "is not found");

        System.out.println();
        experiment.runAllExperiments();
    }
}
