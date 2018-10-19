package com.company.iterator;

public class ConcretAggregator implements IAggregate {

    String[] tasks={"task1","task2","task3"};

    @Override
    public IIterator getIterator() {
        return new Iterator();
    }

    private class Iterator implements IIterator{
        int index=0;

        @Override
        public boolean hasNext() {
            return tasks.length>index;
        }

        @Override
        public Object getNext() {
            return tasks[index++];
        }
    }
}
