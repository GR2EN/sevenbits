package main.it.sevenbits;

// TODO: MUST HAVE REFACTORING
public class Formatter {

  public static String format(String source) {
    StringBuilder sb = new StringBuilder();
    String trimmedSource = source.replaceAll(" ", "");
    int posOfLastSemicolon = trimmedSource.lastIndexOf(';');

    for (int i = 0; i < trimmedSource.length(); i++) {
      if (trimmedSource.charAt(i) == '{') {
        sb.append(" ").append(trimmedSource.charAt(i)).append("\n    ");
        continue;
      } else if (i != posOfLastSemicolon && trimmedSource.charAt(i) == ';') {
        sb.append(trimmedSource.charAt(i)).append("\n    ");
        continue;
      } else if (i == posOfLastSemicolon) {
        sb.append(trimmedSource.charAt(i)).append("\n");
        continue;
      }

      sb.append(trimmedSource.charAt(i));
    }

    return sb.toString();
  }

}
