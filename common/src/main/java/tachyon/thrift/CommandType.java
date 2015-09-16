/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package tachyon.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum CommandType implements org.apache.thrift.TEnum {
  Unknown(0),
  Nothing(1),
  Register(2),
  Free(3),
  Delete(4),
  Persiste(5);

  private final int value;

  private CommandType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static CommandType findByValue(int value) { 
    switch (value) {
      case 0:
        return Unknown;
      case 1:
        return Nothing;
      case 2:
        return Register;
      case 3:
        return Free;
      case 4:
        return Delete;
      case 5:
        return Persiste;
      default:
        return null;
    }
  }
}
