package goodweather.controllers;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by nikita.shubarev@masterdata.ru on 15.11.2017.
 */
public class ZipCode {

  @NotEmpty
  @Pattern(regexp = "(\\s*\\d{1,6}(?:[-\\s]\\d{1,6})?\\s*)||((\\s*\\d{1,6}(?:[-\\s]\\d{1,6})?\\s*)(,\\s*\\d{1,6}(?:[-\\s]\\d{1,6})?\\s*)*)" +
                    "||((\\s*\\d{1,6}(?:[-\\s]\\d{1,6})?\\s*)( \\s*\\d{1,6}(?:[-\\s]\\d{1,6})?\\s*)*)")
  private String zipCode;

  public ZipCode() {
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }
}