class Solution {
    public String interpret(String command) {
        StringBuilder parsed = new StringBuilder();

        for (int i = 0; i < command.length(); i++) {
            char ch = command.charAt(i);

            if (ch == 'G') {
                parsed.append(ch);
            } else if (ch == '(') {
                if (command.charAt(i + 1) == ')') {
                    parsed.append("o");
                    i++;
                } else {
                    parsed.append("al");
                    i += 3;
                }
            }
        }

        return parsed.toString();
    }
}