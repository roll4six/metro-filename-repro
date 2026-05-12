package repro

import dev.zacsweers.metro.DependencyGraph
import dev.zacsweers.metro.GraphExtension

object Lvl1Scope
object Lvl2Scope
object Lvl3Scope
object Lvl4Scope
object Lvl5Scope
object Lvl6Scope
object Lvl7Scope
object Lvl8Scope
object Lvl9Scope
object Lvl10Scope

@DependencyGraph
interface RootGraph {
    val child: Lvl1GraphExtension.Factory

    @DependencyGraph.Factory
    interface Factory {
        fun create(): RootGraph
    }
}

@GraphExtension(scope = Lvl1Scope::class)
interface Lvl1GraphExtension {
    val child: Lvl2GraphExtension.Factory
    @GraphExtension.Factory interface Factory { fun create(): Lvl1GraphExtension }
}

@GraphExtension(scope = Lvl2Scope::class)
interface Lvl2GraphExtension {
    val child: Lvl3GraphExtension.Factory
    @GraphExtension.Factory interface Factory { fun create(): Lvl2GraphExtension }
}

@GraphExtension(scope = Lvl3Scope::class)
interface Lvl3GraphExtension {
    val child: Lvl4GraphExtension.Factory
    @GraphExtension.Factory interface Factory { fun create(): Lvl3GraphExtension }
}

@GraphExtension(scope = Lvl4Scope::class)
interface Lvl4GraphExtension {
    val child: Lvl5GraphExtension.Factory
    @GraphExtension.Factory interface Factory { fun create(): Lvl4GraphExtension }
}

@GraphExtension(scope = Lvl5Scope::class)
interface Lvl5GraphExtension {
    val child: Lvl6GraphExtension.Factory
    @GraphExtension.Factory interface Factory { fun create(): Lvl5GraphExtension }
}

@GraphExtension(scope = Lvl6Scope::class)
interface Lvl6GraphExtension {
    val child: Lvl7GraphExtension.Factory
    @GraphExtension.Factory interface Factory { fun create(): Lvl6GraphExtension }
}

@GraphExtension(scope = Lvl7Scope::class)
interface Lvl7GraphExtension {
    val child: Lvl8GraphExtension.Factory
    @GraphExtension.Factory interface Factory { fun create(): Lvl7GraphExtension }
}

@GraphExtension(scope = Lvl8Scope::class)
interface Lvl8GraphExtension {
    val child: Lvl9GraphExtension.Factory
    @GraphExtension.Factory interface Factory { fun create(): Lvl8GraphExtension }
}

@GraphExtension(scope = Lvl9Scope::class)
interface Lvl9GraphExtension {
    val child: Lvl10GraphExtension.Factory
    @GraphExtension.Factory interface Factory { fun create(): Lvl9GraphExtension }
}

@GraphExtension(scope = Lvl10Scope::class)
interface Lvl10GraphExtension {
    @GraphExtension.Factory interface Factory { fun create(): Lvl10GraphExtension }
}
