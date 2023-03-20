package oving6.delegation.office;

import java.util.function.BinaryOperator;

public class Clerk implements Employee{
    
    private int taskCount;
    private Printer printer;

    public Clerk(Printer printer){

    }

    public double doCalculations(BinaryOperator<Double> operation, double value1, double value2) {
        this.taskCount++;
        return (operation.apply(value1,value2));

    }

    public void printDocument(String document) {
        this.printer.printDocument(document, this);
        this.taskCount++;
    }

    public int getTaskCount() {
        return this.taskCount;
    }

    public int getResourceCount() {
        return 1;
    }
}
