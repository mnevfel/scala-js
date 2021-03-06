package scala.scalajs.js.typedarray

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** <span class="badge badge-ecma6" style="float: right;">ECMAScript 6</span>
 *  A [[TypedArray]] of signed 16-bit integers
 */
@js.native
@JSGlobal
class Int16Array private[this] () extends TypedArray[Short, Int16Array] {

  /** Constructs a Int16Array with the given length. Initialized to all 0 */
  def this(length: Int) = this()

  /** Creates a new Int16Array with the same elements than the given TypedArray
   *
   *  The elements are converted before being stored in the new Int8Array.
   */
  def this(typedArray: TypedArray[_, _]) = this()

  /** Creates a new Int16Array with the elements in the given array */
  def this(array: js.Iterable[_]) = this()

  /** Creates a Int16Array view on the given ArrayBuffer */
  def this(buffer: ArrayBuffer, byteOffset: Int = 0, length: Int = ???) = this()

}

/** <span class="badge badge-ecma6" style="float: right;">ECMAScript 6</span>
 *  [[Int16Array]] companion
 */
@js.native
@JSGlobal
object Int16Array extends TypedArrayStatic
