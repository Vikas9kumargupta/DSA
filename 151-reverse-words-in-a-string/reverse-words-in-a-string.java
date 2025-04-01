class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        Stack<String> st = new Stack<>();
        int j = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && s.charAt(i - 1) != ' ') {
                st.push(s.substring(j, i).trim());
                j = i + 1;
            }
        }
        st.push(s.substring(j));

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop()).append(" ");
        }

        return sb.toString().trim();
    }
}