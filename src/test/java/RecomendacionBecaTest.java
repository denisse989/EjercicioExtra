import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class RecomendacionBecaTest {
    Utils utilsMock= Mockito.mock(Utils.class);
    @BeforeAll
    public static void before(){
        MockedStatic<Helpers>mocked=Mockito.mockStatic(Helpers.class);
        mocked.when(()->Helpers.applicaBeca())

    }
    @ParameterizedTest
    @CsvSource({
            "1,1",
    })
    public void verify(int ci,String expectedResult){
        Mockito.when(utilsMock.getNota(ci)).thenReturn(90);
        RecomendacionBeca recomendacionBeca=new RecomendacionBeca(utilsMock);
        String actualResult=recomendacionBeca.recomendacionBeca(ci);
        Assertions.assertEquals(expectedResult,actualResult,"Error de valores");
        Mockito.verify(utilsMock).getNota(ci);
    }
}
