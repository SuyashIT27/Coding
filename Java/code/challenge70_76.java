public class challenge70_76 {

    public static void main(String[] args) {
        //This is question No. 70.
        /*Student st= new Student();
        st.age=21;
        st.name="Suyash Verma";
        String c=st.toString();
        System.out.println(c);
        st.a=21;
        st.b=89;
        System.out.println(st.addition());*/
        Student st=new Student();
        Student.concatinate();
    }
    // Question no 70.
    public static class Student{
        String name;
        int age;
        int a;
//          int c= a*Math.PI;
         private int b;

        public String toString(){

            return "the name is "+name+".The age is "+age;
        }
        public int addition(){
            int sum=a+b;
            return sum;
        }
    //Question no. 71?
    public static void  concatinate(){
     StringBuffer sb=new StringBuffer("hello");
     sb.append("my");
     sb.append("name");
     sb.append("is suyash verma.");
     System.out.println( "Using to string:"+ sb.toString().toUpperCase());
    }

    }
    }

