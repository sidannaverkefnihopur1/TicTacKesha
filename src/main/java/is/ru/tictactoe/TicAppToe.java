
package is.ru.tictactoe;

import static spark.Spark.*;
import spark.*;
import spark.Request;
import spark.Response;
import spark.Route;

public class TicAppToe {

    private static final GameLogic gl = new GameLogic();
    private static Board gb = new Board();

    public static void main(String[] args) {
        staticFileLocation("/public");
        setPort(Integer.valueOf(System.getenv("PORT")));


    post( new Route("/move") {
        @Override
        public Object handle(Request request, Response response) {
          String move = String.valueOf(request.queryParams("theMove"));
          String player = String.valueOf(request.queryParams("thePlayer"));
          int[] onField = gl.statementToInt(move);
          gb.putOnField(onField, player.charAt(0));
          if (gb.isWinner(player.charAt(0))) return "Winner";
          else return "No winner...";
       }
      });
    }
  }
