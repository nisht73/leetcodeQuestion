class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] arr = path.split("/");

        for(String i : arr ){
            if(i.equals("..") && (!stack.isEmpty())){
                 stack.pop();
            } else if(!i.isEmpty() && !i.equals(".") && !i.equals("..")){
                 stack.push(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String i : stack){
            sb.append("/");
            sb.append(i);
        }
        return sb.length() == 0 ? "/" :sb.toString();
    }
}