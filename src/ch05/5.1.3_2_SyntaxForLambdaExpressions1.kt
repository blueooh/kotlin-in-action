package ch05.ex1_3_2_SyntaxForLambdaExpressions1

fun main(args: Array<String>) {
    { println(42) }()
}

// Decompile
//public static final void main(@NotNull String[] args) {
//    Intrinsics.checkNotNullParameter(args, "args");
//    ((Function0)null.INSTANCE).invoke();
//}