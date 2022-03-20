public class BarkingDog {
    public static void main(String[] args) {
        shouldWakeUp(true, -1);
    }
    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
        boolean wakeUp = false;
        if (hourOfDay < 0 || hourOfDay > 23) {
            System.out.println(wakeUp);
            return wakeUp;
        } else if (hourOfDay < 8 || hourOfDay > 22) {
            if (barking) {
                wakeUp = true;
                System.out.println(wakeUp);
                return wakeUp;
            } else {
                System.out.println(wakeUp);
                return wakeUp;
            }
        } else {
            System.out.println(wakeUp);
            return wakeUp;
        }
    }
//        public static void main(String[] args) throws Exception {
//            // init Current time
//            int currentTime = 10;
//
//            // Check should wake up or not
//            boolean shouldWakeup = checkWakeUp(currentTime, true);
//
//            // Log result
//            if(shouldWakeup) {
//                System.out.print("WAKE UPP");
//            } else {
//                System.out.print("Continue sleep");
//            }
//
//        }
//
//        public static boolean checkWakeUp(int currentHour, boolean isBarking) throws Exception {
//            // check time should to run this function;
//            if(currentHour < 0 || currentHour > 23) {
//                System.out.printf("Time is not valid");
//                throw new Exception("ERROR");
//            }
//
//            boolean timeShouldWakeUp =  currentHour > 22 || currentHour < 8;
//
//            return (isBarking && timeShouldWakeUp);
//        }
    }
