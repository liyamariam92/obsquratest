	class StringBu{
public static void main(String args[])
{
StringBuilder sb=new StringBuilder("Hello");
System.out.println(sb);
sb.append("world");
System.out.println(sb);
sb.insert(2,"java");
System.out.println(sb);
sb.replace(4,8,"hai");
System.out.println(sb);
sb.reverse();
System.out.println(sb);
}
}
