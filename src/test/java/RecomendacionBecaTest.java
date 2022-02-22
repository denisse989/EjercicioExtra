import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class RecomendacionBecaTest {
    Utils utilsMock= Mockito.mock(Utils.class);

    @Test
    public void verify1(){
        MockedStatic<Helpers>mocked=Mockito.mockStatic(Helpers.class);
        mocked.when(()->Helpers.applicaBeca(123)).thenReturn(true);

        Mockito.when(utilsMock.getNota(123)).thenReturn(0);
        RecomendacionBeca recomendacionBeca=new RecomendacionBeca(utilsMock);

        String actualResult=recomendacionBeca.recomendacionBeca(123);
        String expectedResult="NO APLICA A BECA POR PROMEDIO ACADEMICO";
        Assertions.assertEquals(expectedResult,actualResult,"Error de valores");
        Mockito.verify(utilsMock).getNota(123);
    }
    @Test
    public void verify2(){
        MockedStatic<Helpers>mocked=Mockito.mockStatic(Helpers.class);
        mocked.when(()->Helpers.applicaBeca(123)).thenReturn(true);

        Mockito.when(utilsMock.getNota(123)).thenReturn(90);
        RecomendacionBeca recomendacionBeca=new RecomendacionBeca(utilsMock);

        String actualResult=recomendacionBeca.recomendacionBeca(123);
        String expectedResult="SI APLICA A BECA";
        Assertions.assertEquals(expectedResult,actualResult,"Error de valores");
        Mockito.verify(utilsMock).getNota(123);
    }
    @Test
    public void verify3(){
        MockedStatic<Helpers>mocked=Mockito.mockStatic(Helpers.class);
        mocked.when(()->Helpers.applicaBeca(123)).thenReturn(true);

        Mockito.when(utilsMock.getNota(123)).thenReturn(90);
        RecomendacionBeca recomendacionBeca=new RecomendacionBeca(utilsMock);

        String actualResult=recomendacionBeca.recomendacionBeca(123);
        String expectedResult="SI APLICA A BECA";
        Assertions.assertEquals(expectedResult,actualResult,"Error de valores");
        Mockito.verify(utilsMock).getNota(123);
    }
    @Test
    public void verify4(){
        MockedStatic<Helpers>mocked=Mockito.mockStatic(Helpers.class);
        mocked.when(()->Helpers.applicaBeca(123)).thenReturn(true);

        Mockito.when(utilsMock.getNota(123)).thenReturn(90);
        RecomendacionBeca recomendacionBeca=new RecomendacionBeca(utilsMock);

        String actualResult=recomendacionBeca.recomendacionBeca(123);
        String expectedResult="SI APLICA A BECA";
        Assertions.assertEquals(expectedResult,actualResult,"Error de valores");
        Mockito.verify(utilsMock).getNota(123);
    }
    @Test
    public void verify5(){
        MockedStatic<Helpers>mocked=Mockito.mockStatic(Helpers.class);
        mocked.when(()->Helpers.applicaBeca(123)).thenReturn(true);

        Mockito.when(utilsMock.getNota(123)).thenReturn(90);
        RecomendacionBeca recomendacionBeca=new RecomendacionBeca(utilsMock);

        String actualResult=recomendacionBeca.recomendacionBeca(123);
        String expectedResult="SI APLICA A BECA";
        Assertions.assertEquals(expectedResult,actualResult,"Error de valores");
        Mockito.verify(utilsMock).getNota(123);
    }
    @Test
    public void verify6(){
        MockedStatic<Helpers>mocked=Mockito.mockStatic(Helpers.class);
        mocked.when(()->Helpers.applicaBeca(123)).thenReturn(true);

        Mockito.when(utilsMock.getNota(123)).thenReturn(90);
        RecomendacionBeca recomendacionBeca=new RecomendacionBeca(utilsMock);

        String actualResult=recomendacionBeca.recomendacionBeca(123);
        String expectedResult="SI APLICA A BECA";
        Assertions.assertEquals(expectedResult,actualResult,"Error de valores");
        Mockito.verify(utilsMock).getNota(123);
    }
    @Test
    public void verify7(){
        MockedStatic<Helpers>mocked=Mockito.mockStatic(Helpers.class);
        mocked.when(()->Helpers.applicaBeca(123)).thenReturn(true);

        Mockito.when(utilsMock.getNota(123)).thenReturn(90);
        RecomendacionBeca recomendacionBeca=new RecomendacionBeca(utilsMock);

        String actualResult=recomendacionBeca.recomendacionBeca(123);
        String expectedResult="SI APLICA A BECA";
        Assertions.assertEquals(expectedResult,actualResult,"Error de valores");
        Mockito.verify(utilsMock).getNota(123);
    }
    @Test
    public void verify8(){
        MockedStatic<Helpers>mocked=Mockito.mockStatic(Helpers.class);
        mocked.when(()->Helpers.applicaBeca(123)).thenReturn(true);

        Mockito.when(utilsMock.getNota(123)).thenReturn(90);
        RecomendacionBeca recomendacionBeca=new RecomendacionBeca(utilsMock);

        String actualResult=recomendacionBeca.recomendacionBeca(123);
        String expectedResult="SI APLICA A BECA";
        Assertions.assertEquals(expectedResult,actualResult,"Error de valores");
        Mockito.verify(utilsMock).getNota(123);
    }
    @Test
    public void verify9(){
        MockedStatic<Helpers>mocked=Mockito.mockStatic(Helpers.class);
        mocked.when(()->Helpers.applicaBeca(123)).thenReturn(true);

        Mockito.when(utilsMock.getNota(123)).thenReturn(90);
        RecomendacionBeca recomendacionBeca=new RecomendacionBeca(utilsMock);

        String actualResult=recomendacionBeca.recomendacionBeca(123);
        String expectedResult="SI APLICA A BECA";
        Assertions.assertEquals(expectedResult,actualResult,"Error de valores");
        Mockito.verify(utilsMock).getNota(123);
    }
}
