/* tslint:disable:no-unused-variable */

import { TestBed, async, inject } from '@angular/core/testing';
import { IteamsearchService } from './itemsearch.service';

describe('Service: Iteamsearch', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [IteamsearchService]
    });
  });

  it('should ...', inject([IteamsearchService], (service: IteamsearchService) => {
    expect(service).toBeTruthy();
  }));
});
