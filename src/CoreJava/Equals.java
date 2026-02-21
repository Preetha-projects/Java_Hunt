package CoreJava;
/*
By default:
      equals() compares memory references, not content. behaves like "=="
      String overrides equals() to compare content.

*/
public class Equals{
        public static void main(String[] args) {
/*
       i. Default implementation of equals():

            public boolean equals(Object obj) {
                return (this == obj); // compares memory references
            }


       ii.  When overriding equals(), it must follow 5 rules:

            1. Reflexive
                 x.equals(x) → true

            2. Symmetric
                If x.equals(y) → true
                then y.equals(x) → true

            3. Transitive
                If x.equals(y) and y.equals(z)
                then x.equals(z)

            4. Consistent
                 Multiple calls return same result (if state unchanged)

            5. Null-safe
                 x.equals(null) → false

            @Override
                public boolean equals(Object obj) {
                    if (this == obj) return true;
                    if (obj == null) return false;
                    if (getClass() != obj.getClass()) return false;
                    Employee other = (Employee) obj;
                    return id == other.id &&
                           Objects.equals(name, other.name);
                 }


 */
            String s1 = new String("Hello");
            String s2 = new String("Hello");
            System.out.println(s1.equals(s2)); // true, because String overrides equals() to compare content

            Object o1 = new Object();
            Object o2 = new Object();
            System.out.println(o1.equals(o2)); // false, because Object's equals() compares memory references

            int a = 5;
            int b = 5;
            // System.out.println(a.equals(b)); // compile error, because primitives do not have methods
        }
}
