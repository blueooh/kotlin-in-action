package ch05.ex1_4_2_AccessingVariablesInScope1

/**
 * Capture
 */
fun printProblemCounts(responses: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0
    responses.forEach {
        if (it.startsWith("4")) {
            clientErrors++
        } else if (it.startsWith("5")) {
            serverErrors++
        }
    }
    println("$clientErrors client errors, $serverErrors server errors")

// Decompile
//    Intrinsics.checkNotNullParameter(responses, "responses");
//    int clientErrors = 0;
//    int serverErrors = 0;
//    Iterable $this$forEach$iv = (Iterable)responses;
//    int $i$f$forEach = false;
//    Iterator var5 = $this$forEach$iv.iterator();
//
//    while(var5.hasNext()) {
//        Object element$iv = var5.next();
//        String it = (String)element$iv;
//        int var8 = false;
//        if (StringsKt.startsWith$default(it, "4", false, 2, (Object)null)) {
//            ++clientErrors;
//        } else if (StringsKt.startsWith$default(it, "5", false, 2, (Object)null)) {
//            ++serverErrors;
//        }
//    }
//
//    String var10 = clientErrors + " client errors, " + serverErrors + " server errors";
//    System.out.println(var10);
}

fun main(args: Array<String>) {
    val responses = listOf("200 OK", "418 I'm a teapot",
                           "500 Internal Server Error")
    printProblemCounts(responses)
}
