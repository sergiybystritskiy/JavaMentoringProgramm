class LinkedList {
    static Cell firstElement;

    static class  Cell <T> {
        T value;
        Cell next;
        Cell previous;

        Cell(T d) {
            value = d;
            previous = next = null;
        }
    }

    public static <T> void addCell(T new_value) {
        Cell new_cell = new Cell(new_value);
        Cell lastElement = firstElement;
        new_cell.next = null;

        if(firstElement == null) {
            new_cell.previous = null;
            firstElement = new_cell;
            return;
        }
        while(lastElement.next != null)
            lastElement = lastElement.next;
        lastElement.next = new_cell;
        lastElement.previous = lastElement;
        return;
    }

    public static void printList(Cell cell) {
        Cell lastElement = null;
        while(cell != null) {
            System.out.print(cell.value + " ");
            lastElement = cell;
            cell = cell.next;
        }
    }

    public static void deleteCell(Cell firstElement, Cell elementToDelete) {
        if(firstElement == null || elementToDelete == null) {return;}
        if(firstElement == elementToDelete) {
            firstElement = elementToDelete.next;
        }
        if (elementToDelete.next!=null) {
            elementToDelete.next.previous=elementToDelete.previous;
        }
        if (elementToDelete.previous!=null) {
            elementToDelete.previous.next=elementToDelete.next;
        }
        return;
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.addCell("6");
        llist.addCell(true);
        llist.addCell("10");
        llist.addCell(4);
        llist.addCell(false);
        llist.printList(firstElement);
        llist.deleteCell(firstElement,firstElement);
        llist.deleteCell(firstElement,firstElement.next);
        System.out.println("");
        llist.printList(firstElement);
    }
}

