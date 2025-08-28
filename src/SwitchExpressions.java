public class SwitchExpressions {
    public static void main(String[] args) {


        String emoji = switch("HAPPY"){
            case "HAPPY" -> "😀";
            case "SAD" -> "😞";
            case "TIRED" -> "🥱";
            case "EXCITED" -> "😱";
            default -> "🤔";
        };
        System.out.println(emoji);

        String feeling = switch("good"){
            case "good" -> "feeling happy";
            case "bad" -> "feeling sad";
            default -> "not feeling anything";
        };
        System.out.println(feeling);
        // switch expression is different form switch case,
    }
}
