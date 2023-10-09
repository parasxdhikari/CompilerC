package ip;

import script.Input;
import script.TokenReader;
import org.antlr.v4.runtime.Token;
import script.Result;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        String input = "./src/main/java/ip/test.txt";
        Result<Input<Token>> rTokenReader = TokenReader.lexFile(input, IPLexer::new);
        rTokenReader.forEach(rt -> rt.stream().forEach(t -> {
            if(t.getType() == IPLexer.IP)
                System.out.printf("IP FOUND %s\n", t.getText());
//            else if (t.getType() == TIMELexer.Hour) {
//                System.out.printf("HOUR FOUND %s\n", t.getText());
//            }
        }));
    }
}

