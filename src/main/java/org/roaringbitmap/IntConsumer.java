package org.roaringbitmap;

/**
 * An IntConsumer receives the int values contained in a data structure. Values can be expected to
 * be visited in sequence, each value is visited once.
 * 
 * Usage:
 * 
 * <pre>
 * {@code
 *  bitmap.forEach(new IntConsumer() {
 *
 *    &#64;Override
 *    public void accept(int value) {
 *      // do something here
 *      
 *    }});
 *   }
 * }
 * </pre>
 */
public interface IntConsumer {
  /**
   * Receives the integer
   * 
   * @param value the integer value
   */
  public void accept(int value);
}