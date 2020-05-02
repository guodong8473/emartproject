import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'percentpipe'
})
export class PercentpipePipe implements PipeTransform {

  transform(percent : number): any {
    return percent * 100 + "%";
  }

}
