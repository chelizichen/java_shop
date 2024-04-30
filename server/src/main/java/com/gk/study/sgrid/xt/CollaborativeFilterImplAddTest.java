package com.gk.study.sgrid.xt;

import java.util.List;

public class CollaborativeFilterImplAddTest {
    public static void main(String[] args) {
        CollaborativeFilterImpl collaborativeFilter = new CollaborativeFilterImpl();
        collaborativeFilter.WithDefaultLength(10);
        collaborativeFilter.WithLimitMaxFactoryWeight(70.0);
        collaborativeFilter.WithDefaultFactories(CollaborativeFilterImplTest.test());

        collaborativeFilter.addFactoryWeight(new CollaborativeFactor(0.0,11,"杯子"));
        collaborativeFilter.addFactoryWeight(new CollaborativeFactor(0.0,11,"杯子"));
        collaborativeFilter.addFactoryWeight(new CollaborativeFactor(0.0,11,"杯子"));
        collaborativeFilter.addFactoryWeight(new CollaborativeFactor(0.0,11,"杯子"));
        collaborativeFilter.addFactoryWeight(new CollaborativeFactor(0.0,11,"杯子"));
        collaborativeFilter.addFactoryWeight(new CollaborativeFactor(0.0,11,"杯子"));
        collaborativeFilter.addFactoryWeight(new CollaborativeFactor(0.0,11,"杯子"));
        collaborativeFilter.addFactoryWeight(new CollaborativeFactor(0.0,11,"杯子"));
        List<CollaborativeFactor> currentFactories = collaborativeFilter.getCurrentFactories();
        for (CollaborativeFactor collaborativeFactor : currentFactories) {
            System.out.println("测试 | "+ collaborativeFactor);
        }
    }

}