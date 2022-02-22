import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class RecomendacionBecaTest {
    Utils utilsMock= Mockito.mock(Utils.class);

    @BeforeAll
    public static void before(){
        MockedStatic<Helpers>mocked=Mockito.mockStatic(Helpers.class);
        mocked.when(()->Helpers.applicaBeca(123)).thenReturn(true);
        mocked.when(()->Helpers.applicaBeca(1234)).thenReturn(true);
        mocked.when(()->Helpers.applicaBeca(1235)).thenReturn(true);
        mocked.when(()->Helpers.applicaBeca(1236)).thenReturn(true);
        mocked.when(()->Helpers.applicaBeca(1237)).thenReturn(true);
        mocked.when(()->Helpers.applicaBeca(1238)).thenReturn(true);
        mocked.when(()->Helpers.applicaBeca(1239)).thenReturn(false);
        mocked.when(()->Helpers.applicaBeca(1230)).thenReturn(false);
        mocked.when(()->Helpers.applicaBeca(1231)).thenReturn(false);

    }


    @Test
    public void verify1(){

        Mockito.when(utilsMock.getNota(123)).thenReturn(0);
        RecomendacionBeca recomendacionBeca=new RecomendacionBeca(utilsMock);

        String actualResult=recomendacionBeca.recomendacionBeca(123);
        String expectedResult="NO APLICA A BECA POR PROMEDIO ACADEMICO";
        Assertions.assertEquals(expectedResult,actualResult,"Error de valores");
        Mockito.verify(utilsMock).getNota(123);
    }
    @Test
    public void verify2(){


        Mockito.when(utilsMock.getNota(1234)).thenReturn(1);
        RecomendacionBeca recomendacionBeca=new RecomendacionBeca(utilsMock);

        String actualResult=recomendacionBeca.recomendacionBeca(1234);
        String expectedResult="NO APLICA A BECA POR PROMEDIO ACADEMICO";
        Assertions.assertEquals(expectedResult,actualResult,"Error de valores");
        Mockito.verify(utilsMock).getNota(1234);
    }
    @Test
    public void verify3(){


        Mockito.when(utilsMock.getNota(1235)).thenReturn(50);
        RecomendacionBeca recomendacionBeca=new RecomendacionBeca(utilsMock);

        String actualResult=recomendacionBeca.recomendacionBeca(1235);
        String expectedResult="NO APLICA A BECA POR PROMEDIO ACADEMICO";
        Assertions.assertEquals(expectedResult,actualResult,"Error de valores");
        Mockito.verify(utilsMock).getNota(1235);
    }
    @Test
    public void verify4(){

        Mockito.when(utilsMock.getNota(1236)).thenReturn(89);
        RecomendacionBeca recomendacionBeca=new RecomendacionBeca(utilsMock);

        String actualResult=recomendacionBeca.recomendacionBeca(1236);
        String expectedResult="NO APLICA A BECA POR PROMEDIO ACADEMICO";
        Assertions.assertEquals(expectedResult,actualResult,"Error de valores");
        Mockito.verify(utilsMock).getNota(1236);
    }
    @Test
    public void verify5(){


        Mockito.when(utilsMock.getNota(1237)).thenReturn(90);
        RecomendacionBeca recomendacionBeca=new RecomendacionBeca(utilsMock);

        String actualResult=recomendacionBeca.recomendacionBeca(1237);
        String expectedResult="SI APLICA A BECA";
        Assertions.assertEquals(expectedResult,actualResult,"Error de valores");
        Mockito.verify(utilsMock).getNota(1237);
    }
    @Test
    public void verify6(){

        Mockito.when(utilsMock.getNota(1238)).thenReturn(100);
        RecomendacionBeca recomendacionBeca=new RecomendacionBeca(utilsMock);

        String actualResult=recomendacionBeca.recomendacionBeca(1238);
        String expectedResult="SI APLICA A BECA";
        Assertions.assertEquals(expectedResult,actualResult,"Error de valores");
        Mockito.verify(utilsMock).getNota(1238);
    }
    @Test
    public void verify7(){

        RecomendacionBeca recomendacionBeca=new RecomendacionBeca();

        String expectedResult="EL ESTUDIANTE NO CURSO AUN EL 60% DE LAS MATERIAS";
        Assertions.assertEquals(expectedResult,recomendacionBeca.recomendacionBeca(1239),"Error de valores");

    }
    @Test
    public void verify8(){
        RecomendacionBeca recomendacionBeca=new RecomendacionBeca();
        String expectedResult="EL ESTUDIANTE NO CURSO AUN EL 60% DE LAS MATERIAS";
        Assertions.assertEquals(expectedResult,recomendacionBeca.recomendacionBeca(1230),"Error de valores");
    }
    @Test
    public void verify9(){

        RecomendacionBeca recomendacionBeca=new RecomendacionBeca();
        String expectedResult="EL ESTUDIANTE NO CURSO AUN EL 60% DE LAS MATERIAS";
        Assertions.assertEquals(expectedResult,recomendacionBeca.recomendacionBeca(1231),"Error de valores");
    }
}
