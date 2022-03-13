package com.company;
import java.util.*;

public class SinglyLinkedList<E> {
    private ListNode<E> nodePertama;
    private ListNode<E> nodeTerakhir;
    private String nama;

    public SinglyLinkedList() {
        this("List Pegawai");
    }

    public SinglyLinkedList(String listName) {
        nama = listName;
        nodePertama = nodeTerakhir = null;
    }
    //Input posisi Data pada bagian awal
    public void inputDiawal(E insertItem) {
        ListNode newNode = new ListNode(insertItem);

        if (isEmpty()) {
            nodePertama = nodeTerakhir = new ListNode<E>(insertItem);
        }

        else {
            newNode.next = nodePertama;
            nodePertama = newNode;

        }
    }

    //Input posisi Data pada bagian akhir
    public void inputDiakhir(E insertItem) {
        ListNode newNode = new ListNode(insertItem);

        if (isEmpty()) {
            nodePertama = nodeTerakhir = new ListNode<E>(insertItem);
        }

        else {
            nodeTerakhir.next = newNode;
            nodeTerakhir = newNode;

        }
    }

    //Menghapus data bagian Awal
    public E hapusDataPertama() throws NoSuchElementException {
        E removedItem = nodePertama.data;
        if (isEmpty()) {
            throw new NoSuchElementException(nama + " is empty");
        }
        if(nodePertama != null){
            ListNode temp = new ListNode(nodePertama);
            nodePertama = nodePertama.next;
            temp = null;
        }
        return removedItem;

    }

    //Menghapus data bagian akhir
    public E hapusDataTerakhir() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException(nama + " is empty");
        }

        E removedItem = nodeTerakhir.data;

        if (nodePertama == nodeTerakhir) {
            nodePertama = nodeTerakhir = null;
        } else {
            ListNode<E> current = nodePertama;

            while (current.next != nodeTerakhir) {
                current = current.next;

            }

            nodeTerakhir = current;
            current.next = null;
        }

        return removedItem;
    }

    private boolean isEmpty() {
        return nodePertama == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.printf("Empty %s%n", nama);
            return;
        }

        System.out.printf("%s adalah: %n", nama);
        ListNode<E> current = nodePertama;

        while (current != null) {
            System.out.printf("%s", current.data + "\n");
            current = current.next;
        }

    }

}
