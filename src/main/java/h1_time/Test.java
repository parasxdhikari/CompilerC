package h1_time;
import script.Input;
import script.TokenReader;
import org.antlr.v4.runtime.Token;
import script.Result;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        String input = "./src/main/java/h1_time/test.txt";
        Result<Input<Token>> rTokenReader = TokenReader.lexFile(input, TIMELexer::new);
        rTokenReader.forEach(rt -> rt.stream().forEach(t -> {
            if(t.getType() == TIMELexer.TIME) System.out.printf("TIME FOUND %s\n", t.getText());
        }));
    }
}
