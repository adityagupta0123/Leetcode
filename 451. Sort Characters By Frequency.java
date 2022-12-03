class Solution {
   private static class Node implements Comparable<Node> {
    private final char ch;
    private int count;
    
    private Node(char ch, int count) {
        this.ch = ch;
        this.count = count;
    }
    
    @Override
    public int compareTo(Node other) {
        return other.count - this.count;
    }
}

public String frequencySort(String s) {
    int[] table = new int[256];
    for (char ch: s.toCharArray()) {
        table[ch]++;
    }
    Queue<Node> queue = new PriorityQueue<Node>();
    for (int i = 0; i < 256; i++) {
        if (table[i] > 0) {
            queue.add(new Node((char) i, table[i]));
        }
    }
    StringBuilder builder = new StringBuilder();
    Node node;
    while (!queue.isEmpty()) {
        node = queue.poll();
        for (int i = 0; i < node.count; i++) {
            builder.append(node.ch);
        }
    }
    return builder.toString();

    }
}
