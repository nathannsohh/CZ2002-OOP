class classA {
    void print(int x, String y){
        System.out.println("A " + x + y);
    }
}

class classB extends classA {
    void print(int x){
        System.out.println("B " + x);
    }
}

class classC extends classA {
    void print(String x, String y){
        System.out.println("C " + x + y);
    }
}

class classD extends classC {
    void print(String a, String b){
        System.out.print("D "+a+b);
    }
}

class classE extends classC {
    void print(String x){
        System.out.println("E "+x);
    }
}

class classF extends classE {
    void print(int x){
        System.out.println("F "+x);
    }
}

class classG extends classE {
    void print(String x){
        System.out.println("G "+x);
    }
}

public class main {
    public static void main(String[] args) {
        classA a = new classF();
        classC f = (classC) a;
        f.print(88,"there");
    }
}