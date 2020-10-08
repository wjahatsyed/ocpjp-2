package com.wjahatsyed.ocp.chapter_one.notcert;

import com.wjahatsyed.ocp.chapter_one.cert.Roo_2;

/**
 * Created by Syed Wajahat on 7/14/2020.
 */
public class UseARoo {
    public void testIt() {
        Roo_2 roo_2 = new Roo_2();
        /*
        The below line will give a compile time error because
        the method doRothing has private access in the class where it is declared.
         */
        //roo_2.doRothing();
    }
}
