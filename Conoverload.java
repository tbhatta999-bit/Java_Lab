class Box {
    int l, b, h;

    Box() {
        l = b = h = 1;
    }

    Box(int x) {
        l = b = h = x;
    }

    Box(int x, int y, int z) {
        l = x;
        b = y;
        h = z;
    }

    void volume() {
        System.out.println("Volume = " + (l * b * h));
    }

    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(5);
        Box b3 = new Box(2, 3, 4);

        b1.volume();
        b2.volume();
        b3.volume();
    }
}
