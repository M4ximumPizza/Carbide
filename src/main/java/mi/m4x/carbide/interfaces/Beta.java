package mi.m4x.carbide.interfaces;

import java.lang.annotation.*;

/**
 * Indicates that the annotated element is part of a beta API or feature.
 * <p>
 * This annotation is used to mark classes, methods, or fields that are still under active development
 * and are not yet considered stable or production-ready. APIs annotated with {@code @Beta} may be
 * subject to change or removal in future versions without prior notice.
 * </p>
 *
 * <p>
 * Consumers of the API should avoid relying on {@code @Beta}-annotated elements in critical
 * or production systems. These elements are intended primarily for testing, experimentation,
 * or internal use during the feature's development phase.
 * </p>
 *
 * <p>
 * Once a {@code @Beta} feature is deemed stable, this annotation will be removed.
 * </p>
 *
 * <h3>Example Usage:</h3>
 * <pre>{@code
 * @Beta
 * public class ExperimentalFeature {
 *     // ...
 * }
 * }</pre>
 *
 * @see Deprecated
 * @since 1.0.1
 * @author M4ximumpizza
 */
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR})
public @interface Beta {
}

