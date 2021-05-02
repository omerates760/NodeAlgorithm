class Node(var point: Int) {

    var path: Double? = null
    private var nodeQueue: Node? = null

    fun appendToEnd(point: Int) {
        val end = Node(point)
        var n: Node? = this
        while (n!!.nodeQueue != null) {
            n = n.nodeQueue
        }
        n.nodeQueue = end
    }

    fun printNodes() {
        var currentPoint = this
        while (currentPoint.nodeQueue != null) {
            currentPoint = currentPoint.nodeQueue!!
            println(currentPoint.point)
        }
    }

    fun length(h: Node?): Int {
        var counter = 0

        return counter
    }

    fun sumOfNodes(): Double {
        var sum = 0.0
        var currentNodes = this
        sum += currentNodes.point
        while (currentNodes.nodeQueue != null) {
            currentNodes = currentNodes.nodeQueue!!
            sum += currentNodes.point
        }
        return sum
    }

    fun deleteNode(headPoint: Node, point: Int):  Node?{
        val n: Node = headPoint
        var currentNodes = n
        while (currentNodes.nodeQueue != null) {
            if (currentNodes.nodeQueue!!.point == point) {
                if (currentNodes.nodeQueue!!.nodeQueue != null) {
                    currentNodes.nodeQueue = currentNodes.nodeQueue!!.nodeQueue!!
                    return headPoint
                } else {
                    currentNodes.nodeQueue = null
                    return headPoint
                }
            }
            currentNodes = currentNodes.nodeQueue!!
        }
        return headPoint
    }
}
