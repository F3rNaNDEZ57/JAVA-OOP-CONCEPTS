public class OuterClass {
    int outerField = 10; // outer class field

    public void outerMethod() { // outer class method
        System.out.println("Outer method");
    }

    public class InnerClass { // inner class non static
        int innerField = 20; // inner class field

        public void innerMethod() { // inner class method
            System.out.println("Inner method");
        }
    }

    public static class StaticInnerClass { // inner class static
        int staticInnerField = 30; // inner class field

        public void staticInnerMethod() { // inner class method
            System.out.println("Static inner method");
        }
    }

    public void classInsideMethod(){
        System.out.println("Class inside method");
        class ClassInsideMethod { // class inside method
            int classInsideMethodField = 40; // class inside method field

            public void classInsideMethodMethod() { // class inside method method
                System.out.println("Class inside method method");
            }
        }

        ClassInsideMethod classInsideMethod = new ClassInsideMethod();
        System.out.println(classInsideMethod.classInsideMethodField);
        classInsideMethod.classInsideMethodMethod();
    }
}
