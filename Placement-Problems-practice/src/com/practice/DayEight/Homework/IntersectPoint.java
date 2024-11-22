package com.practice.DayEight.Homework;

import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public class IntersectPoint {

    public static int getLength(ListNode head) {
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getLength(headA);
        int lenB = getLength(headB);

        int diff = Math.abs(lenA - lenB);

        if (lenA > lenB) {
            for (int i = 0; i < diff; i++) {
                headA = headA.next;
            }
        } else {
            for (int i = 0; i < diff; i++) {
                headB = headB.next;
            }
        }

        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }

    public static ListNode createList(int[] values) {
        if (values == null || values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of nodes in the first linked list:");
        int nA = sc.nextInt();
        int[] listAValues = new int[nA];
        System.out.println("Enter the values for the first linked list:");
        for (int i = 0; i < nA; i++) {
            listAValues[i] = sc.nextInt();
        }
        ListNode listA = createList(listAValues);

        System.out.println("Enter the number of nodes in the second linked list:");
        int nB = sc.nextInt();
        int[] listBValues = new int[nB];
        System.out.println("Enter the values for the second linked list:");
        for (int i = 0; i < nB; i++) {
            listBValues[i] = sc.nextInt();
        }
        ListNode listB = createList(listBValues);

        System.out.println("Enter the position of intersection (0 if no intersection):");
        int intersectionPos = sc.nextInt();

        if (intersectionPos > 0) {
            ListNode tempA = listA;
            ListNode tempB = listB;
            int counter = 1;

            while (counter < intersectionPos && tempA != null) {
                tempA = tempA.next;
                counter++;
            }

            if (tempA != null) {
                while (tempB.next != null) {
                    tempB = tempB.next;
                }
                tempB.next = tempA;
            }
        }

        ListNode intersectionNode = getIntersectionNode(listA, listB);


        if (intersectionNode != null) {
            System.out.println("Intersection at node with value: " + intersectionNode.val);
        } else {
            System.out.println("No intersection.");
        }
    }
}
