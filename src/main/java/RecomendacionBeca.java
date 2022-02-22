public class RecomendacionBeca {
    Utils utils;

    public RecomendacionBeca(Utils objetoMockeado) {
        this.utils = objetoMockeado;
    }

    public String recomendacionBeca(int ci){
        boolean aplicaBeca=Helpers.applicaBeca(ci);
        if(aplicaBeca){
            int nota=utils.getNota(ci);
            if (nota>=90 && nota<=100){
                return "SI APLICA A BECA";
            }else {
                return "NO APLICA A BECA POR PROMEDIO ACADEMICO";
            }
        }else {
            return "EL ESTUDIANTE NO CURSO AUN EL 60% DE LAS MATERIAS";
        }

    }
}
