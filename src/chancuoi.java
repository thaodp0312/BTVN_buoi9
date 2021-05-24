import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class chancuoi {
    void sochancuoi(int [] mang) {
int n= mang.length;
        int chan = -1;
        for (int i = 0;i<n;i++){
            if ((mang[i]%2)==0){
                chan = mang[i];
            }
        }
        System.out.println("Số chẵn cuối cùng là "+chan);
    }
}