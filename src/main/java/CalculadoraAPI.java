import io.javalin.Javalin;

public class CalculadoraAPI {

    private static Operacoes operacoes = new Operacoes();

    public static void main(String[] args) {
        Javalin app = Javalin.create().start(5000);
        app.get("/soma/{valor1}/{valor2}", ctx -> {
            float v1 = Float.parseFloat(ctx.pathParam("valor1"));
            float v2 = Float.parseFloat(ctx.pathParam("valor2"));
            ctx.result("Resultado: "+operacoes.soma(v1,v2));
        });

        app.get("/subtracao/{valor1}/{valor2}", ctx -> {
            float v1 = Float.parseFloat(ctx.pathParam("valor1"));
            float v2 = Float.parseFloat(ctx.pathParam("valor2"));
            ctx.result("Resultado: "+operacoes.subtracao(v1,v2));
        });

        app.get("/multiplicacao/{valor1}/{valor2}", ctx -> {
            float v1 = Float.parseFloat(ctx.pathParam("valor1"));
            float v2 = Float.parseFloat(ctx.pathParam("valor2"));
            ctx.result("Resultado: "+operacoes.multiplicacao(v1,v2));
        });

        app.get("/divisao/{valor1}/{valor2}", ctx -> {
            float v1 = Float.parseFloat(ctx.pathParam("valor1"));
            float v2 = Float.parseFloat(ctx.pathParam("valor2"));
            ctx.result("Resultado: "+operacoes.divisao(v1,v2));
        });
    }
}
