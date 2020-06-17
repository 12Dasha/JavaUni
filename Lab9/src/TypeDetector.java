public class TypeDetector {
    public Types getType(String s) {
        if (s.length() == 1 && !isDigit(s)) {
            return Types.CHAR;
        } else if (isDouble(s)) {
            return Types.DOUBLE;
        } else if (isInteger(s)) {
            return Types.INT;
        }
        return Types.STRING;
    }

    private boolean isDouble(String s) {
        try {
            try {
                Integer.parseInt(s);
                return false;
            } catch (Exception e) {
                Double.parseDouble(s);
                return true;
            }
        } catch (Exception e) {
            return false;
        }

    }

    private boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private boolean isDigit(String s) {
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (!Character.isDigit(c))
                return false;
        }
        return true;
    }
}
