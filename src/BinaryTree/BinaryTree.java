package BinaryTree;

public class BinaryTree {

    static class Cell {
        public int value;
        public Cell right;
        public Cell left;
        public Cell(int d) {
            value = d;
            right = left = null;
        }

        private Cell withLeft(int v) {
            this.left = new Cell(v);
            return left;
        }

        private Cell withRight(int v) {
            this.right = new Cell(v);
            return right;
        }

        public static void search(Cell startCell,int numberToFind) {
            if(startCell == null) {
                return;
            } else if(startCell.value == numberToFind) {
                System.out.println("Element you wanted to find is found");
            } else {
                search(startCell.left, numberToFind);
                search(startCell.right, numberToFind);
            }

        }
        public static void main(String[] args) {
            Cell top = new Cell(1);
            top.withLeft(3).withLeft(5);
            top.withRight(4).withRight(6);
            search(top,5);
        }
    }
}

