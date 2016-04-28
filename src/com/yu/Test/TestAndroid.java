package com.yu.Test;

import com.yu.dao.Calculatordao;
import com.yu.dao.Icalculatordao;
import org.junit.Test;

/**
 * Created by lenovo on 2016/4/28.
 */
public class TestAndroid {

    @Test
    public void test01(){
        Icalculatordao cal=new Calculatordao();
        cal.compute("1/4","+","3/10");


    }

}
