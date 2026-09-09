class ValidParentheses {
    public boolean isValid(String s) {
        // Dictionary to store matching brackets
        Map<Character, Character> myDictionary = new HashMap<Character, Character>();
        myDictionary.put(')', '(');
        myDictionary.put(']', '[');
        myDictionary.put('}', '{');

        // Stack to keep the track of opening brackets
        Stack<Character> stack = new Stack<Character>();

        // Iterate through each character in the string
        for (char letter: s.toCharArray()){

            // If its a closing bracket
            if(myDictionary.containsKey(letter)){

                // Check if stack is empty or top doesn't matches
                if(stack.empty() || stack.peek() != myDictionary.get(letter))
                    return false;
                // Pop the matching opening bracket
                stack.pop();
            }
            else
                // Push opening bracket onto stack
                stack.push(letter);
        }
        // Return true is stack is empty, false otherwise
        return stack.empty();
    }
}
