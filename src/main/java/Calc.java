public class Calc {
    public static double run(String exp) {
        exp = exp.replaceAll(" ", "");

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            switch (c) {
                case '+':
                    return run(exp.substring(0, i)) + run(exp.substring(i + 1));
                case '-':
                    if (i == 0 || !Character.isDigit(exp.charAt(i - 1)))
                        continue;
                    return run(exp.substring(0, i)) - run(exp.substring(i + 1));
                case '*':
                    return run(exp.substring(0, i)) * run(exp.substring(i + 1));
                case '/':
                    return run(exp.substring(0, i)) / run(exp.substring(i + 1));
            }
        }

        return Double.parseDouble(exp);
    }
}
