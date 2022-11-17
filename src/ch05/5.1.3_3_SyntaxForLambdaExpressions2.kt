package ch05.ex1_3_3_SyntaxForLambdaExpressions2

fun main(args: Array<String>) {
    run { println(42) }
}

// Decompile
//public static final void main(@NotNull String[] args) {
//    Intrinsics.checkNotNullParameter(args, "args");
//    int var1 = false;
//    byte var2 = 42;
//    System.out.println(var2);
//}