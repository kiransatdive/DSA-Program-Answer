class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        Rook r = new Rook();
        r.moves();
        Bear b = new Bear();
        b.eat();
    }
}

// multiple pinterfaces
interface Harbihorus {
    void eat();
}

interface Carnivorus {
    void eat();
}

class Bear implements Harbihorus, Carnivorus {
    public void eat() {
        System.out.println("Vegitables,Meat");
    }
}
//Single Interface
interface chessPlayer {
    void moves();

}

class Queen implements chessPlayer {
    public void moves() {
        System.out.println("up,down,left,right,diagona ");

    }

}

class Rook implements chessPlayer {
    public void moves() {
        System.out.println("up,down,left,right ");

    }
}
