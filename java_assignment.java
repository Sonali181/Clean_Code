public class Clean_Code {

        static class MyList {

            private int Minimum;

            private int Maximum;
            public int getMinimum(){
                return Minimum;
            }
            public void setMinimum(int value){
                this.Minimum = value;
            }
            public int getMaximum(){
                return Maximum;
            }
            public void setMaximum(int value){
                this.Maximum = value;
            }
        }

        static MyList MinimumAndMaximumNo(int arr[], int length) {
            MyList obj = new MyList();
            int i;

            if (length == 1) {
                obj.setMaximum(arr[0]);
                obj.setMinimum(arr[0]);
                return obj;
            }

            if (arr[0] > arr[1]) {
                obj.setMaximum(arr[0]);
                obj.setMinimum(arr[1]);
            }
            else {
                obj.setMaximum(arr[1]);
                obj.setMinimum(arr[0]);
            }
            for (i = 2; i < length; i++) {
                if (arr[i] > obj.getMaximum()) {
                    obj.setMaximum(arr[i]);
                }
                else if (arr[i] < obj.getMinimum()) {
                    obj.setMinimum(arr[i]);
                }
            }
            return obj;
        }
        public static void main(String args[]) {
            int distance[] = {1000, 11, 445, 1, 330, 3000};
            int length = 6;
            MyList Obj = MinimumAndMaximumNo(distance, length);
            System.out.printf("\n Minimum Value is %d", Obj.getMinimum());
            System.out.printf("\n Maximum Value is %d", Obj.getMaximum());
        }
    }

