package Pertemuan_2_Collection;

import java.util.*;

class Collection {
    public static void main(String[] args) {
        // List
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("nanta");
        ll.add("ernu");
        System.out.println(ll);
        System.out.println(ll.peek());
        System.out.println(ll.get(0));
        ll.remove("nanta");
        System.out.println(ll);

        LinkedList<Integer> l = new LinkedList<Integer>();
        l.add(1);
        l.add(2);
        System.out.println(l);

        // Stack
        Stack<String> s = new Stack<String>();
        s.push("nanta");
        s.push("ernu");
        System.out.println(s);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s);

        // Queue
        Queue<String> q = new LinkedList<String>();
        q.add("nanta");
        q.add("ernu");
        System.out.println(q);
        System.out.println(q.peek());
        q.remove();
        System.out.println(q);

        // Set
        Set<String> st = new HashSet<String>();
        st.add("nanta");
        st.add("ernu");
        System.out.println(st);
        st.remove("ernu");
        st.add("nanta");
        System.out.println(st);

        // Map
        Map<String, Integer> m = new HashMap<String, Integer>();
        m.put("ernu", 2);
        m.put("nanta", 1);
        System.out.println(m);
        m.remove("ernu");
        System.out.println(m);

    }
}
