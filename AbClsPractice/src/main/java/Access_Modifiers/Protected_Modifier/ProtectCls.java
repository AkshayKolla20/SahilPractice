package Access_Modifiers.Protected_Modifier;

import Access_Modifiers.Default_Modifier.DefaultCls;
import Access_Modifiers.Public_Modifier.PublicCls;

class ProtectMain extends DefaultCls {
    public static void main(String[] args) {
        ProtectMain dc = new ProtectMain();
        PublicCls pc = new PublicCls();

        dc.protectA();
        pc.A();
    }
}
