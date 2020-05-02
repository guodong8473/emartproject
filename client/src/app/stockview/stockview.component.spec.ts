/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { StockviewComponent } from './stockview.component';

describe('StockviewComponent', () => {
  let component: StockviewComponent;
  let fixture: ComponentFixture<StockviewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StockviewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StockviewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
