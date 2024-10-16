package HWCalculator.LV3;

public enum OperatorType {
    ADD {
        public double operate(double firstReal, double secondReal) {
            return firstReal + secondReal;
        }
    },
    SUBTRACT {
        public double operate(double firstReal, double secondReal) {
            return firstReal - secondReal;
        }
    },
    MULTIPLY {
        public double operate(double firstReal, double secondReal){
            return firstReal * secondReal;
        }
    },
    DIVIDE {
        public double operate(double firstReal, double secondReal){
            return firstReal/secondReal;
        }
    },
    REMAIN {
        public double operate(double firstReal, double secondReal){
            return firstReal % secondReal;
        }
    };
    public abstract double operate(double firstReal, double secondReal);
}
