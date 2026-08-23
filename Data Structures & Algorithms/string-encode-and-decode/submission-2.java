class Solution {
    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < strs.size(); i++) {
            int Slen = strs.get(i).length();
            s.append(Slen);
            s.append('#');
            s.append(strs.get(i));
        }
        return s.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int num = 0;
            while (Character.isDigit(str.charAt(i))) {
                num = num * 10 + (str.charAt(i) - '0');
                i++;
            }
            StringBuilder s = new StringBuilder();
            for (int j = i + 1; j < num + i + 1; j++) {
                s.append(str.charAt(j));
            }
            list.add(s.toString());
            s.setLength(0);
            i += num;
            num = 0;
        }
        return list;
    }
}
